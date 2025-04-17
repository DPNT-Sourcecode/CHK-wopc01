package io.accelerate.solutions.CHK;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {

    
        private SumSolution sum;
    
        @BeforeEach
        public void setUp() {
            sum = new SumSolution();
        }
    
        @Test
        public void compute_sum() {
            assertThat(sum.compute(1, 1), equalTo(2));
        }
    }
    
    
}


