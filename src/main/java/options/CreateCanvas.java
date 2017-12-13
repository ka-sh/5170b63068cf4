package options;

/**
 * Created by jb on 12/11/17.
 */
public class CreateCanvas implements Feature {
    public String About() {
        return "C w h\tShould create a new canvas of width w and height h.";
    }

    public String getOption() {
        return "C";
    }

    public void validate(String[] params) throws Exception {
//TODO:apply max/min value limits
        //TODO:Round all floats or deny float numbers
    }

    public void execute(String[][] canvas, String[] params) {
    int x= Integer.parseInt(params[0])+1;
    int y = Integer.parseInt(params[1])+1;
    canvas=new String[x][y];
    drawCanvasBoundries(canvas,x,y);
    }

    private void drawCanvasBoundries(String[][]canvas,int x, int y){
for(int i =0;i<x;i++){
    canvas[0][i]="-";
    canvas[x-1][i]="-";
}
for(int j=0;j<y;j++){
    canvas[j][0]="|";
    canvas[j][x-1]="|";
}

    }
}
