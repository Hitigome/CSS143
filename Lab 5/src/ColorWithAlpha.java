public class ColorWithAlpha extends SimpleColor{
    private int alpha;

    public int getAlpha(){
        return alpha;
    }

    public void setAlpha(int alpha){
        if(alpha>0 && alpha<255){
            this.alpha = alpha;
        }else{
            throw new ColorException();
        }
    }
    
}
