package sml.instructions

import sml.Machine
import sml.Instruction

class MulInstruction(label: String, val register: Int, val value: Int, val mulValue: Int) : Instruction(label, "mul") {
    override fun execute(m: Machine) {
        m.registers.setRegister(register, m.registers.getRegister(value) * m.registers.getRegister(mulValue))
    }

    override fun toString(): String {
        return super.toString() + " register " + register + " value is " + value
    }
}
