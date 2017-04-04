import java.util.ArrayList;
import java.util.Collection;

import org.testng.annotations.Test;
		public class Objectcreatedin {
			@Test
			public void trial(){
			Properties123 xmen = new Properties123();
			String x =xmen.getMobileNo();
			System.out.println(x);
			
			 Collection collect = new ArrayList();
			collect.add(xmen.getMobileNo());
			collect.add(xmen.getUrl());
			collect.add(xmen.getUserName());
			ArrayList<Properties123> al = new ArrayList<Properties123>();
			al.addAll(collect);
			
		}
			
			
			
			
			
			
			
			
		}
