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
    
    ColorWithAlpha(int alpha){
        super.setR(0);
        super.setB(0);
        super.setG(0);
    }

    ColorWithAlpha(int r, int g, int b, int alpha){
        super(r,g,b);
    }

    ColorWithAlpha(ColorWithAlpha colorWithAlpha){
        
    }
}
