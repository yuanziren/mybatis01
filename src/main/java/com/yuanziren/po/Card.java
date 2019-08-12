package com.yuanziren.po;

public class Card {

    private Integer id;

    private Integer cardNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNum=" + cardNum +
                '}';
    }
}
