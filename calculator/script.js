let screen = document.getElementById('screen');
let equation = '';

function addToScreen(value) {
    equation += value;
    screen.value = equation;
}

function addOperator(operator) {
    equation += operator;
    screen.value = equation;
}

function calculate() {
    try {
        let result = eval(equation);
        screen.value = result;
        equation = result.toString();
    } catch (error) {
        screen.value = 'Error';
        equation = '';
    }
}

function clearScreen() {
    equation = '';
    screen.value = '';
}
