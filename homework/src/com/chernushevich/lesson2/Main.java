package com.chernushevich.lesson2;

public class Main {
    private static int mainInt;
    private byte mainByte;
    private short mainShort;
    private long mainLong;
    private float mainFloat;
    private double mainDouble;
    private char mainChar;
    private boolean mainBoolean;
    private Integer mainIntegerObj;
    private Byte mainByteObj;
    private Short mainShortObj;
    private Long mainLongObj;
    private Float mainFloatObj;
    private Double mainDoubleObj;
    private Character mainCharacterObj;
    private Boolean mainBooleanObj;

    public Main() {
        // Инициализация примитивов
        mainInt = 42;
        mainByte = 1;
        mainShort = 10;
        mainLong = 100L;
        mainFloat = 20.0f;
        mainDouble = 123.456;
        mainChar = 'Z';
        mainBoolean = true;

        // Инициализация оберток
        mainIntegerObj = 42;
        mainByteObj = 1;
        mainShortObj = 10;
        mainLongObj = 100L;
        mainFloatObj = 20.0F;
        mainDoubleObj = 123.456;
        mainCharacterObj = 'Z';
        mainBooleanObj = true;
    }

    public static void main(String[] args) {
        int psvMainInt;
        byte psvMainByte;
        short psvMainShort;
        long psvMainLong;
        float psvMainFloat;
        double psvMainDouble;
        char psvMainChar;
        boolean psvMainBoolean;
        Integer psvMainIntegerObj;
        Byte psvMainByteObj;
        Short psvMainShortObj;
        Long psvMainLongObj;
        Float psvMainFloatObj;
        Double psvMainDoubleObj;
        Character psvMainCharacterObj;
        Boolean psvMainBooleanObj;

        mainInt = 1;
        System.out.println("mainInt = " + mainInt);

        Main mainInstance = new Main();
        System.out.println("mainInstance.mainInt = " + mainInstance.mainInt);

        psvMainInt = mainInstance.mainInt;
        psvMainInt = psvMainInt + 100;
        System.out.println("psvMainInt = " + psvMainInt);

        System.out.println("mainInstance.mainIntegerObj 1 = " + mainInstance.mainIntegerObj);
        mainInstance.mainIntegerObj = psvMainInt;
        System.out.println("mainInstance.mainIntegerObj 2 = " + mainInstance.mainIntegerObj);

        Global globalInstance = new Global();
        globalInstance.setMyInt(psvMainInt);
        System.out.println("globalInstance.getMyInt() = " + globalInstance.getMyInt());

        globalInstance.setMyIntegerObj(psvMainInt);
        System.out.println("globalInstance.getMyIntegerObj() = " + globalInstance.getMyIntegerObj());
    }
}
