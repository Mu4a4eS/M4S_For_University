package loancalculator;
// Создаем приложение под именем loancalculator
// Оператор package

// Первое, что может появиться в исходном файле Java - это оператор package, 
// который сообщает транслятору, в каком пакете должны определяться содержащиеся
// в данном файле классы. Пакеты задают набор раздельных пространств имен, в 
// которых хранятся имена классов. Если оператор package не указан, классы 
// попадают в безымянное пространство имен, используемое по умолчанию. Если вы 
// объявляете класс, как принадлежащий определенному пакет
import java.awt.event.*;
// Импортируем библиотеку событий
// Оператор import

// После оператора package, но до любого определения классов в исходном 
// Java-файле, может присутствовать список операторов import. Пакеты являются 
// хорошим механизмом для отделения классов друг от друга, поэтому все 
// встроенные в Java классы хранятся в пакетах.
import javax.swing.*;
// Импортируем библиотеку визуализации
public class LoanCalculator implements  ActionListener{
    // Обьявляем класс LoanCalculator
    // Оператор implements

    // Оператор implements - это дополнение к определению класса, реализующего 
    // некоторый интерфейс(ы). 

    //    class имя_класса [extends суперкласс]
    //    [implements интерфейс0 [, интерфейс1...]]
    //    {
    //    тело класса
    //    } 

    // Если в классе реализуется несколько интерфейсов, то их имена разделяются запятыми.
        JTextField txtLabel1 = new JTextField("Стоемость товара, руб.", 20);
        // Текстовые поля класса TextField
        // Текстовое поле класса TextField может быть использовано для ввода 
        //одной строки текста, такой как имя пользователя, адрес URL 
        //или чего-нибудь еще. 

        // Конструкторы класса TextField допускают указание начальной ширины 
        //поля в символах, а также предварительную инициализацию заданной 
        //текстовой строкой.
        JTextField txt1 = new JTextField(8);
        // Первое поле ввода
        // Текстовое поле JTextField

        // Текстовое поле — простой и часто используемый компонент, 
        //предназначенный для ввода небольших по объему (записываемых в одну 
        //строку) текстовых данных. Для создания текстового поля чаще всего 
        //используются конструкторы:

        // JTextField(int columns) — создает пустое текстовое поле, ширина 
        //которого достаточна для размещения columns символов. При этом 
        //пользователь может вводить в текстовое поле строку какой угодно 
        //длины: она просто будет прокручиваться.
        JTextField txtLabel2 = new JTextField("Первоначальный взнос, руб.", 20);
        // Поле Первоначальный взнос
        JTextField txt2 = new JTextField(8);
        // Второе поле ввода
        JTextField txtLabel3 = new JTextField("Процентная ставка, %", 20);
        JTextField txt3 = new JTextField(8);
        JTextField txtLabel4 = new JTextField("Срок кредита, мес.", 20);
        JTextField txt4 = new JTextField(8);
        JTextField txtLabel5 = new JTextField("Сумма в кредит", 20);
        JTextField txtRezult5 = new JTextField(8);
        JTextField txtLabel6 = new JTextField("Процент перначального взноса", 20);
        JTextField txtRezult6 = new JTextField(8);
        JTextField txtLabel7 = new JTextField("Ежемесячный платеж", 20);
        JTextField txtRezult7 = new JTextField(8);
        JTextField txtLabel9 = new JTextField("Переплата", 20);
        JTextField txtRezult9 = new JTextField(8);
        JTextField txtLabel10 = new JTextField("Сумма кредита", 20);
        JTextField txtRezult10 = new JTextField(8);
        JButton btnRezult = new JButton("Вычислить"); 
        // Это кнопка на вычисление 
        // Кнопка JButton

        // Мы постоянно использовали кнопки в предыдущей главе, хотя и не 
        //касались возможностей их настройки. Кнопка — это прямоугольник с 
        //текстом (и/или значком), по которому пользователь щелкает, когда 
        //хочет выполнить какое-то действие (или о чем-то сигнализировать).

        // Кнопка создается одним из пяти конструкторов, в частности JButton(),
        //JButton(String text), JButton(Icon icon), JButton(String text, Icon 
        //icon), параметры которых говорят сами за себя. Пятый конструктор мы 
        //рассмотрим в следующей главе.
        JButton btnClear = new JButton("Очистить");
        // Кнопка очистить
    public static void main(String[] args) {
        // public static void main(String args[ ]) 
        // Ключевое слово main() - основной метод. Это - строка, с которой 
        //начинается выполнение программы. Все приложения Java должны иметь 
        //один метод main(). Давайте расшифруем каждое слово в коде. 

        // Ключевое слово public - это спецификатор доступа. Спецификаторы 
        //доступа будут рассмотрены в последующих главах. Когда члену класса 
        //предшествует public, то к этому члену возможен доступ из кода, 
        //внешнего по отношению к классу, в котором описан данный метод. 
        //В данном случае, main метод объявлен как public так, чтобы JVM мог 
        //обратиться к этому методу. 

        // Ключевое слово static позволяет методу main() вызываться без 
        //потребности создавать образец класса. К объекту класса нельзя 
        //обратиться, не создав это. Но в этом случае, есть копия этого метода,
        //доступного в памяти после того, как класс расположен, даже если не 
        //был создан образец этого класса. Это важно, потому что JVM вызывает 
        //этот метод в первую очередь. Следовательно этот метод должен быть как
        //static и не должен зависеть от экземпляров любого создаваемого класса. 

        // Ключевое слово void говорит компилятору, что метод не возвращает 
        //никакого значения. 

        // main ()- метод, который исполняет специфическую задачу. Это место
        //с которого начинается выполнение всех приложений Java. Класс, 
        //который не имеет основного метода, может быть успешно откомпилирован,
        //но не может быть выполнен, поскольку он не имеет отправной точки
        //выполнения, которой является main() метод. 

        // String args [ ]  - один из параметров, который передаётся основному 
        //методу. Любая информация, которую мы передаём методу, получена 
        //переменными, которые упомянуты в пределах круглой скобки метода. Эти
        //переменные - параметры этого метода. Даже если мы не должны передавать
        //никакой информации методу, название метода должно сопровождаться 
        //пустыми круглыми скобками, args [ ] (переменная) - массив типа String.
        //Параметры, которые передают в командной строке, сохранены в этом 
        //массиве. Открытие и закрытие изогнутой скобки для main метода 
        //составляют блок метода. Функции, которые будут выполнены от основного
        //метода должны быть определены в этом блоке.
        LoanCalculator calc = new LoanCalculator();
        // Задаем новую переменную
    } 
    LoanCalculator(){
        GUI();
        // GUI
        // Графический Интерфейс пользователя (GUI) используется, чтобы 
        //принимать более дружественный вид для пользователей. GUI изменяется от приложения к приложению и может состоять из текстовых полей вода, меток, списков и других различных элементов. Различные языки программирования обеспечивают различные пути и средства создания GUIs; VB или VC ++ могут обеспечить подход "drag and drop" для создания GUI, тогда как С ++ требует, чтобы программист написал полный код для формирования GUI. 

        // В общем, элемент GUI создается, используя следующую процедуру: 
              // 1. Создайте элемент. Например, checkbox или label или listbox и т.д.. 
              // 2. Определите его начальное появление. 
              // 3. Определите, должен ли он занимать определённую позицию или 
              //любую заданную по умолчанию. 
              // 4. Добавьте его на экран.
        listeners();
        // Listener - слушатель. Если правильно помню, это метод который "ждёт"
        // некоторое событие (нажатие клавиши прим.)
        // и передает управление в тот метод, который зарегистрирован на это 
        // событие. Как-то так. Если что не ругайтесь, сам не помню)
    }
    private void GUI(){
        // Создаем Генера Юзер Интерфейс
        txtRezult5.setEditable(false);
        txtRezult6.setEditable(false);
        txtRezult7.setEditable(false);
        txtRezult9.setEditable(false);
        txtRezult10.setEditable(false);
        txtLabel1.setEditable(false);
        txtLabel2.setEditable(false);
        txtLabel3.setEditable(false);
        txtLabel4.setEditable(false);
        txtLabel5.setEditable(false);
        txtLabel6.setEditable(false);
        txtLabel7.setEditable(false);
        txtLabel9.setEditable(false);
        txtLabel10.setEditable(false);
        JPanel panel = new JPanel();
         // Создание панелей
	panel.setBackground(new java.awt.Color(255, 255, 255));
	// Присвоение цвета панелю
	panel.add(txtLabel1);
	panel.add(txt1);
	panel.add(txtLabel2);
	panel.add(txt2); 
	panel.add(txtLabel3);
	panel.add(txt3); 
	panel.add(txtLabel4);
	panel.add(txt4); 
	panel.add(txtLabel5);
	panel.add(txtRezult5);
	panel.add(txtLabel6);
	panel.add(txtRezult6);
	panel.add(txtLabel7);
	panel.add(txtRezult7);
	panel.add(txtLabel9);
	panel.add(txtRezult9);
	panel.add(txtLabel10);
	panel.add(txtRezult10);
	panel.add(btnRezult); 
	panel.add(btnClear); 
	JFrame frame = new JFrame();
	// Создание нового фрейма
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// Закрытие прогрыммы при закрытии окна
	frame.setTitle("Кредитный калькулятор");
	// Название программы в титл
	frame.setLocationRelativeTo(null);
	// Положее окна
	frame.setResizable(false);
	// Запрещаем изменение размера окна
	frame.setSize(340,295);
	// Размер выводимого окна
	frame.getContentPane().add(panel);
	// Присваевание окна от panel
	frame.setVisible(true);
	// Разрешаем видеть окно
   }
   private void listeners(){
	// Выполняем решенеи
	JButton[] arrBtn = {btnRezult, btnClear}; 
	// Задаем кнопки
	for(int i = 0; i<arrBtn.length; i++){
		// Перечисляем вводимые кнопки
		arrBtn[i].addActionListener(this);
		// Присваеваем его к Listener и выполняем его там
	}
   }
   @Override 
   // Проведение отладки
   public void actionPerformed(ActionEvent ae) {
	float num1 = (float) Float.parseFloat(txt1.getText());
	// Вид реальное число num1 присвоить реальное число от txt1
	float num2 = (float) Float.parseFloat(txt2.getText());
	float num3 = (float) Float.parseFloat(txt3.getText());
	float num4 = (float) Float.parseFloat(txt4.getText());
	if(ae.getSource() == btnRezult){
		// Если нажата кнопка то выполняем следующие действия
		txtRezult5.setText(Float.toString(num1-num2));
		// Вычисляем необходимый кредит
		txtRezult6.setText(Float.toString(num2/num1*100));
		txtRezult7.setText(Double.toString(Math.ceil(((double)(num1-num2)*((0.0083+(0.0083/(((float)Math.pow(1.0083, num4))-1))))+1))));
		txtRezult9.setText(Double.toString(Math.ceil(((double)((num1-num2)*(0.0083+(0.0083/(((float)Math.pow(1.0083, num4))-1))))+1)*num4-(num1-num2))));
		txtRezult10.setText(Double.toString(Math.ceil(((double)(num1-num2)*(0.0083+(0.0083/(((float)Math.pow(1.0083, num4))-1)))+1))*num4));
	}else{
		// Иначе
		txtRezult5.setText("");
		// Очищаем поле
		txtRezult6.setText("");
		// Очищаем поле
		txtRezult7.setText("");
		// Очищаем поле
		txtRezult9.setText("");
		// Очищаем поле
		txtRezult10.setText("");
		// Очищаем поле
		txt1.setText("");
		// Цена кредита которое нам необходима, очищаем его
		txt2.setText("");
		// очищаем поле первоначальные взнос
		txt3.setText("");
		// Очищаем поле ставка процентов
		txt4.setText("");
		// Очищаем поле количество месяцев
	}
   }
}
