package src.main.files;

public class Grid {
    char[][] positions;

    public Grid()
    {
       positions = new char[3][3];
//       for(int i=0;i<3;i++)
//       {
//           for(int j=0;j<3;j++)
//           {
//               positions[i][j] = -1;
//           }
//       }
    }

    public void mark(int row, int col, char symbol)
    {
        positions[row][col] = symbol;
    }
}
