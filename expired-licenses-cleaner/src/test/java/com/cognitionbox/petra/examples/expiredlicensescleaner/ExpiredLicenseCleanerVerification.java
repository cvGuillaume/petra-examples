package com.cognitionbox.petra.examples.expiredlicensescleaner;

import com.cognitionbox.petra.verification.Verification;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class ExpiredLicenseCleanerVerification extends Verification {
    public ExpiredLicenseCleanerVerification(VerificationTask task) {
        super(task);
    }

    @Parameterized.Parameters(name = "{0}")
    public static Collection tasks() {
        setRoot(DeleteExpiredLicenses.class);
        return Verification.tasks();
    }
}
