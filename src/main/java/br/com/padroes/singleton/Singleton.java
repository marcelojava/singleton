package br.com.padroes.singleton;

public final class Singleton {

    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    private Singleton(){}

    public static final Singleton getInstance() {
        return singleton;
    }
}
