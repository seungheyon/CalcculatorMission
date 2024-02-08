package calculator.controller;

import calculator.domain.converter.PostfixExpressionConverter;
import calculator.domain.service.CalculateService;
import calculator.domain.util.Printer;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CalculatorController {

    PostfixExpressionConverter postfixExpressionConverter = new PostfixExpressionConverter();
    CalculateService calculateService = new CalculateService();
    Printer printer = new Printer();

    public void start(){
        Scanner scanner = new Scanner(System.in);
        String inputOperation = scanner.nextLine();

        List<String> postfixExpression = postfixExpressionConverter.convertInfixToPostfix(postfixExpressionConverter.seperateOperation(inputOperation));
        printer.println(calculateService.calculatePostfixExpression(postfixExpression));
    }
}
