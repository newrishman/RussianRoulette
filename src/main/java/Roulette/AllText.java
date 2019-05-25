package Roulette;

class AllText {
    protected static String introduction() {
        return "\nДобро пожаловать в Русскую рулетку! \n" +
                "\nВы можете выбрать игру с классическими правилами (1) \n" +
                "или с прокруткой барабана револьвера при каждом ходе (2) \n" +
                "\nИгра рассчитана на одного или двух игроков.\n" +
                "\nУдачи!\n";
    }

    protected static String choice() {
        return "Выберите правила, по которым будет проходить игра (1 или 2)";
    }

    protected static String quantity() {
        return "Укажите количество игроков (1 или 2)";
    }

    protected static String start() {

        return "\nИгра начинается!\n";
    }

    protected static String drum() {

        return "Вставьте патрон и вращайте барабан револьвера (нажмите три пробела + enter)";
    }

    protected static String user() {

        return ", приставьте револьвер к голове и жмите на спусковой крючок! (нажмите enter)";
    }

    protected static String nothing() {

        return "Вы слышите, как курок глухо бьет в пустоту\n";
    }

    protected static String death() {

        return "Звук выстрела заполняет комнату. Вы буквально пораскинули мозгами.";
    }

    protected static String error() {
        return "Некорректный ввод! Но не прерывать же игру, да?";
    }
}
