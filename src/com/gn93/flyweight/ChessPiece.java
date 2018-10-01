package com.gn93.flyweight;

public abstract class ChessPiece {

    private final String name;
    private final int numberPosition;
    private final String letterPosition;
    private final Color color;

    public ChessPiece(String name, int numberPosition, String letterPosition, String color_name) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color_name.toLowerCase()){
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                throw new UnsupportedOperationException("No such color");
        }
    }

    public Color getColor() {
        return color;
    }
}
