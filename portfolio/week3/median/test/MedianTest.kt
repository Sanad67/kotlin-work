// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    // first we check for base case when only one number any number really
    "Median when size=1" {
        median(listOf(8.0f)) shouldBe (8.0f plusOrMinus tolerance)
    }
    "Median when size=2" { // handles median for even numbers at a small scale so erorr catching is easier
        median(listOf(1.0f, 3.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }
    "Median when size=3" { // likewise for the odd same reasoning as in the even
        median(listOf(1.0f, 3.0f, 2.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }
    "Median when size=4" { //tesing cases above the
        median(listOf(4.0f, 1.0f, 3.0f, 2.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }

})
