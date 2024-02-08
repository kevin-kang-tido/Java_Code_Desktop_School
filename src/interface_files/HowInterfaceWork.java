package interface_files;

interface Print{
    void  print();
    void showValues();
}

class Priner implements Print{

    @Override
    public void print() {
        System.out.println("this is print abstruction from interface ");

    }
    @Override
    public void showValues() {
        System.out.println("this is show values abstrction method form interface");

    }
}

class  scanner implements Print{

    @Override
    public void print() {
        System.out.println("scanner print ");
    }

    @Override
    public void showValues() {
        System.out.println("scanner show values !!!!!!!");

    }
}


public class HowInterfaceWork {
    public static void main(String[] args) {
        Print printer = new Priner();
        Print scannner = new scanner();

        printer.print();
        printer.showValues();
        scannner.print();
        scannner.showValues();

    }
}
