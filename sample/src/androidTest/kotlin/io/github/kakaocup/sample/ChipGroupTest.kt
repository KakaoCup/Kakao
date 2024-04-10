package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.ChipGroupActivityScreen
import org.hamcrest.CoreMatchers.`is`
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ChipGroupTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ChipGroupActivity::class.java)

    @Test
    fun testSelectChipByText() {
        onScreen<ChipGroupActivityScreen> {
            chipGroup {
                val chipText = "Chip2"
                selectChip(chipText)
                isChipSelected(chipText)
                isChipSelected(`is`(chipText))
            }
        }
    }

    @Test
    fun testSelectChipByIndex() {
        onScreen<ChipGroupActivityScreen> {
            chipGroup {
                selectChipAt(3)
                isChipSelected("Chip4")
            }
        }
    }

    @Test
    fun testSelectChipById() {
        onScreen<ChipGroupActivityScreen> {
            val chipId = R.id.chip1
            chipGroup1 {
                hasChip(chipId)
                selectChip(chipId)
                isChipSelected(chipId)
            }
        }
    }

    @Test
    fun testChipsGroupSize() {
        onScreen<ChipGroupActivityScreen> {
            chipGroup { hasSize(4) }
            chipGroup1 { hasSize(1) }
        }
    }
}
