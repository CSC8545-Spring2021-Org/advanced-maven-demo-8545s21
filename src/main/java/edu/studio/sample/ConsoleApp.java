package edu.studio.sample;

public class ConsoleApp {

    public static void main(String[] args) {

        System.out.println("Hello Advanced Maven");

        ConsoleApp demo = new ConsoleApp();

        demo.emptyBlock(true);

        demo.emptyStatement();

    }

    private void emptyBlock(boolean isEmpty) {
        try {
            Integer.parseInt("clearly not an int");
        }
        catch (NumberFormatException e) {
            // an empty catch block "eats" the exception
            // does Checkstyle see this? Why or why not?
        }

        // how about this?
        if (isEmpty) {

        }
        else {
            // will never get here
        }
    }

    private void emptyStatement() {
        System.out.println("Do you see the problem?");
        ;
    }
}
