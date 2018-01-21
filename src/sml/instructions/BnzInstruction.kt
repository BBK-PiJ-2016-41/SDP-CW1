package sml.instructions

import sml.Instruction
import sml.Machine

class BnzInstruction(label: String, val register: Int, val instruction: String) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {
        val nextProg = (Integer.parseInt((instruction[1]).toString()))
        if (m.registers.getRegister(register) != 0) m.pc = nextProg - 1
    }

    override fun toString(): String {
        return super.toString() + " skip to instruction " + instruction
    }
}
