package com.cognitionbox.petra.examples.lightingsystem;

import com.cognitionbox.petra.annotations.Edge;

import java.util.function.Consumer;

import static com.cognitionbox.petra.lang.Petra.kase;
import static com.cognitionbox.petra.lang.Petra.kases;

@Edge
public class PowerOn implements Consumer<Power> {
    @Override
    public void accept(Power p) {
        kases(p,
                kase(power->power.off() ^ power.on(), power->power.on(),power->{
                    power.powerOn();
                    //System.out.println(Thread.currentThread());
                })
        );
    }
}
