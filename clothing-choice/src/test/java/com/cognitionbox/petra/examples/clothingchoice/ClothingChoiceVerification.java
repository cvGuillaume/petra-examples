package com.cognitionbox.petra.examples.clothingchoice;

import com.cognitionbox.petra.verification.Verification;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class ClothingChoiceVerification extends Verification {
    public ClothingChoiceVerification(VerificationTask task) {
        super(task);
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection tasks() {
        setRoot(ChooseClothingL1.class);
        return Verification.tasks();
    }
}
