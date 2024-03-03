package com.jtdev.shapeshift;



import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    // Sign-In Test//
    public void signInTest() {

        String id = "userid";
        String password = "userpassword";


        AccountService service = new AccountService();


        boolean signInResult = service.signIn(id, password);


        assertTrue(signInResult);
    }
    @Test
    // Sign-Up Test
    public void signup_isCorrect() {
        // Initialize
        AccountService service = new AccountService();

        // Testing Sign-Up Valid Credentials
        assertTrue(accountService.signup("newUsername", "StrongPassword123"));

        // Testing password requirements
        assertFalse(accountService.signup("newUsername", "weak")); // Password too short
        assertFalse(accountService.signup("newUsername", "weakpassword")); // No uppercase letters
        assertFalse(accountService.signup("newUsername", "PASSWORD123")); // No lowercase letters
        assertFalse(accountService.signup("newUsername", "weakpassword")); // No numbers
        assertFalse(accountService.signup("newUsername", "WeakPassword")); // No special characters
    }


        @Test
        public void testCalculateBMI() {
            BMICalculator bmi = new BMICalculator();

            // Test1: Valid input
            double height = 1.75; // in meters
            double weight = 70.0; // in kilograms
            double expectedBMI = 22.86; // expected BMI
            assertEquals(expectedBMI, bmi.calculateBMI(height, weight), 0.01); // tolerance: 0.01
        }

        @Test
        public void testGetBMIStatus() {
            BMICalculator bmiCalculator = new BMICalculator();

            // Test 1: Underweight
            double bmiUnderweight = 17.0;
            assertEquals("Underweight", bmiCalculator.getBMISResult(bmiUnderweight));

            // Test  2: Normal weight
            double bmiNormalWeight = 22.0;
            assertEquals("Normal weight", bmiCalculator.getBMISResult(bmiNormalWeight));

            // Test  3: Overweight
            double bmiOverweight = 27.0;
            assertEquals("Overweight", bmiCalculator.getBMISResult(bmiOverweight));

            // Test  4: Obesity
            double bmiObesity = 32.0;
            assertEquals("Obesity", bmiCalculator.getBMISResult(bmiObesity));
        }

        @Test
        public void testGetRecommendation() {
            BMICalculator bmi = new BMICalculator();

            // Test case 1: Underweight
            double bmiUnderweight = 17.0;
            String expectedRecommendedUnderweight = "You are underweight. It's important to maintain a balanced diet. We suggest you to try bulking with proper guidance using our workout plan.";
            assertEquals(expectedRecommendedUnderweight, bmiCalculator.getRecomm(bmiUnderweight));

            // Test case 2: Normal weight
            double bmiNormalWeight = 22.0;
            String expectedRecommendedNormalWeight = "Your weight is within a healthy range. Keep up the good work and make sure you get frequent exercise and a healthy diet." +
                    "Try our training regimen to keep a regular body.";
            assertEquals(expectedRecommendedNormalWeight, bmiCalculator.getRecomm(bmiNormalWeight));

            // Test case 3: Overweight
            double bmiOverweight = 27.0;
            String expectedRecommendedOverweight = "You have too much weight. To get a healthy weight, think about changing your lifestyle by consuming a healthier food and engaging in more physical activity." +
                    "Try our exercise program to start your new lifestyle.";
            assertEquals(expectedRecommendedOverweight, bmiCalculator.getRecomm(bmiOverweight));

            // Test case 4: Obesity
            double bmiObesity = 32.0;
            String expectedRecommendedObesity = "You are overweight. It's critical to put your health first by making lifestyle adjustments. " +
                    "Using our exercise program can help you lower the health risks linked to obesity.";
            assertEquals(expectedRecommendedObesity, bmiCalculator.getRecomm(bmiObesity));


        }
    }
}