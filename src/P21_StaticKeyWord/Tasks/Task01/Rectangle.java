package P21_StaticKeyWord.Tasks.Task01;

public class Rectangle {
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int Cevre() {
        return (width+length)*2;
    }

    public int Alan() {
        return (width*length);
    }
}
