public class Test {

	static class borderText {
		
		String renderBox[][];
		int x,y;
		
		borderText(String t, String b, int s) 
		{
			Render(t, b, s);
		}
		
		void Show() 
		{
			for (int i = 0; i < y; i++) {
				System.out.print("        ");
				for (int j = 0; j < x; j++) {
					System.out.print(renderBox[i][j]);
				}
				System.out.print("\n");
			}
			System.out.print("\n\n\n");
		}
		
		void Render(String t, String b, int s) 
		{
			this.x = t.length() + s * 2;
			this.y = s * 2 + 1;		
			renderBox = new String[y][x];
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					renderBox[i][j] = b;
				}
			}
			String text[] = t.split("");
			int j = 0;
			for (int i = x - t.length() - s; i < t.length() + s; i++) {
				renderBox[y - s - 1][i] = text[j];
				j++;
			}
		}
	}
	
    public static void main(String[] args)
    {
    	
    	borderText text = new borderText(" Test of border generator ", "#", 1);
    	text.Show();
    	text.Render(" Changing the text ", "^", 2);
    	text.Show();
    }
}
