package Cursada.guia2;

public class Square {

    private float lengthOfASide;

    public Square(float aLength){
        if(aLength <= 0){
            throw new IllegalArgumentException();
        }
        lengthOfASide = aLength;
    }

    public float area(){
        return lengthOfASide * lengthOfASide;
    }

    public float perimeter(){
        return lengthOfASide * 4;
    }

    public float getLengthOfSide(){
        return lengthOfASide;
    }
}
