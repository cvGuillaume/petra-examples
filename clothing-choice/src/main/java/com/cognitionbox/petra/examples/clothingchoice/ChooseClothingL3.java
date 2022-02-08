package com.cognitionbox.petra.examples.clothingchoice;

import com.cognitionbox.petra.annotations.Edge;

import java.util.function.Consumer;

import static com.cognitionbox.petra.lang.Petra.kase;
import static com.cognitionbox.petra.lang.Petra.kases;

@Edge
public class ChooseClothingL3 implements Consumer<SystemL2> {
    @Override
    public void accept(SystemL2 s) {
        kases(s,
                kase(system -> system.sunnyWeekdayUndecidedClothing(),
                        system -> system.sunnyWeekdayHatClothing(),
                        system -> {
                            system.clothing().chooseHat();
                            system.printChoice();
                        }),
                kase(system -> system.rainyWeekdayUndecidedClothing(),
                        system -> system.rainyWeekdaySmartJacketClothing(),
                        system -> {
                            system.clothing().chooseSmartJacket();
                            system.printChoice();
                        }),
                kase(system -> system.moderateWeekdayUndecidedClothing(),
                        system -> system.moderateWeekdayAnyClothing(),
                        system -> {
                            system.clothing().chooseHat();
                            system.printChoice();
                        }),
                kase(system -> system.sunnyWeekendUndecidedClothing(),
                        system -> system.sunnyWeekendTshirtClothing(),
                        system -> {
                            system.clothing().chooseTshirt();
                            system.printChoice();
                        }),
                kase(system -> system.rainyWeekendUndecidedClothing(),
                        system -> system.rainyWeekendRainCoatClothing(),
                        system -> {
                            system.clothing().chooseRainCoat();
                            system.printChoice();
                        }),
                kase(system -> system.moderateWeekendUndecidedClothing(),
                        system -> system.moderateWeekendNotSmartJacketClothing(),
                        system -> {
                            system.clothing().chooseHat();
                            system.printChoice();
                        })
        );
    }
}
