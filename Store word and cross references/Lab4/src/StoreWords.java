import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
public class StoreWords {


	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(fr);//(isr);
		// Reader r = br;
		
		StreamTokenizer st = new StreamTokenizer(br);
		st.slashStarComments(true);
		Hashtable<String,WordReference> hash = new Hashtable<String,WordReference>();


		boolean eof = false;
		do {
			int token = st.nextToken();
			switch (token) {
			case StreamTokenizer.TT_EOF:
				eof = true;
				break;
			case StreamTokenizer.TT_WORD:
				//       System.out.println("Word: " + st.sval);
				// String str = st.sval+" at "+st.lineno();
				WordReference wr;
				wr = hash.get(st.sval);
				if (wr!= null){
					wr.add(st.lineno());
				}
				else{
					wr = new WordReference();
					wr.add(st.lineno());
					hash.put(st.sval,wr );
				}  	  
				break;

			}
		} while (!eof);

		for (String key : hash.keySet()) {
			WordReference w = hash.get(key);
			System.out.println(key+":");
			w.Print();
			System.out.println("");
		}
		

	}


}