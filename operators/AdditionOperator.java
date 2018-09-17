/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import Evaluator.Operand;

/**
 *
 * @author Yiyuan Huang
 */
public class AdditionOperator extends Operator{

    @Override
    public int priority() {
        return 1;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        Operand result = new Operand(op1.getValue() + op2.getValue());
        return result;
    }
    
}
