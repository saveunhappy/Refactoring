package main.java.ReplaceSubClassWithField32.type2;

public class Male extends Person {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
