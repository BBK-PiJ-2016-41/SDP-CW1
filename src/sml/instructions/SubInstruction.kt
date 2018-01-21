package sml.instructions

import sml.Machine
import sml.Instruction

class SubInstruction(label: String, val register: Int, val op1: Int, val op2: Int) : Instruction(label, "sub") {
    override fun execute(m: Machine) {
        val value1 = m.registers.getRegister(op1)
        val value2 = m.registers.getRegister(op2)
        m.registers.setRegister(register, value1 - value2)
    }

    override fun toString(): String {
        return super.toString() + " " + op1 + " - " + op2 + " to " + register
    }
}
