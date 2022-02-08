package com.cognitionbox.petra.examples.clothingchoice;

import com.cognitionbox.petra.annotations.Primative;
import com.cognitionbox.petra.lang.primitives.PValue;

@Primative
public interface Clothing {
    PValue<ClothingEnum> choiceEnum();
    default void chooseSmartJacket(){
        choiceEnum().set(ClothingEnum.SMART_JACKET);}
    default void chooseRainCoat(){
        choiceEnum().set(ClothingEnum.RAIN_COAT);}
    default void chooseTshirt(){
        choiceEnum().set(ClothingEnum.T_SHIRT);}
    default void chooseHat(){
        choiceEnum().set(ClothingEnum.HAT);}
    default boolean undecided(){
        return this.choiceEnum().get()==ClothingEnum.UNDECIDED;
    }
    default boolean smartJacket(){
        return this.choiceEnum().get()==ClothingEnum.SMART_JACKET;
    }
    default boolean rainCoat(){
        return this.choiceEnum().get()==ClothingEnum.RAIN_COAT;
    }
    default boolean Tshirt(){
        return this.choiceEnum().get()==ClothingEnum.T_SHIRT;
    }

    default boolean hat(){
        return this.choiceEnum().get()==ClothingEnum.HAT;
    }

    default void setUndecided(){
        choiceEnum().set(ClothingEnum.UNDECIDED);
    }
}
