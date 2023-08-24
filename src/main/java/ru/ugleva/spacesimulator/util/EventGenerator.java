package ru.ugleva.spacesimulator.util;

import ru.ugleva.spacesimulator.model.Astronaut;

public class EventGenerator {
    public void startAdventure(Astronaut yura) {
        System.out.println("Добро пожаловать в симулятор жизни космонавта Юры на борту исследовательского космического " +
                "корабля \"Луч\"");
        while (checkAll(yura)) {
            int eventNum = (int) (Math.random() * 100);
            if (eventNum >= 0 && eventNum < 10) {
                sleep(yura);
            } else if (eventNum >= 10 && eventNum < 20) {
                eat(yura);
            } else if (eventNum >= 20 && eventNum < 30) {
                talkRobot(yura);
            } else if (eventNum >= 30 && eventNum < 40) {
                flyAsteroid(yura);
            } else if (eventNum >= 40 && eventNum < 50) {
                callToEarth(yura);
            } else if (eventNum >= 50 && eventNum < 60) {
                meetShip(yura);
            } else if (eventNum >= 60 && eventNum < 70) {
                getSick(yura);
            } else if (eventNum >= 70 && eventNum < 80) {
                asteroidBelt(yura);
            } else if (eventNum >= 80 && eventNum < 90) {
                sos(yura);
            } else if (eventNum >= 90 && eventNum < 100) {
                systemBroke(yura);
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("Юры больше нет.\nЭто всегда происходит.\nНеважно как, но со всеми.");
    }

    private void sleep(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep + 40;
        yura.setEp(ep);
        System.out.println("Устав от созерцания млечного пути, Юра понял, что стоит поспать. +40 ОЭ");
        epInfluenceHp(yura);
        status(yura);
    }

    private void eat(Astronaut yura) {
        System.out.println("Пришло время обеда! Пора подкрепиться");
        int eatEventNum = (int) (Math.random() * 100);
        if (eatEventNum >= 0 && eatEventNum < 25) {
            int ep = yura.getEp();
            ep = ep + 30;
            yura.setEp(ep);
            System.out.println("Юра провёл ооочень много времени напротив стенда с выбором меню. В итоге его выбор " +
                    "пал, как всегда, на тюбик со вкусом ЧЕБУПЕЛЕЙ! (любимый тюбик Юры, запасы которого стремительно " +
                    "уменьшаются) +30 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (eatEventNum >= 25 && eatEventNum < 50) {
            int ep = yura.getEp();
            ep = ep + 20;
            yura.setEp(ep);
            System.out.println("Иногда стоит выбрать полезный, насыщенный витаминами обеденный ланч. Юра получил " +
                    "стандартную порцию питательных веществ и готов дальше лететь в неизвестность. +20 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (eatEventNum >= 50 && eatEventNum < 75) {
            int ep = yura.getEp();
            ep = ep + 10;
            yura.setEp(ep);
            System.out.println("Фууу! Похоже, тюбик, выданный стендом сегодня, оказался просроченным. Придётся взять " +
                    "следующий и немного затянуть пояс. +10 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (eatEventNum >= 75 && eatEventNum < 100) {
            int ep = yura.getEp();
            ep = ep - 5;
            yura.setEp(ep);
            System.out.println("Юра с грустью смотрит на пустые ячейки стенда, некогда полные тюбиков. Жаль, но " +
                    "сегодня он остался без обеда. -5 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void talkRobot(Astronaut yura) {
        System.out.println("Не стоит забывать, как разговаривать. Юра болтает со своим единственным собеседником - " +
                "роботом R3D3. Диалог, как всегда, повторяется, робот знает ограниченное число тем для разговоров. " +
                "Юра, сначала немного воспрянув духом от общения, через мгновение снова расстраивается, - он " +
                "единственный живой обитатель Луча. +20 ОЭ; -20 ОЭ");
        status(yura);
    }

    private void flyAsteroid(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep - 20;
        yura.setEp(ep);
        System.out.println("!!!WARNING!!! Произошло столкновение с неопознанным объектом (предположительно тип: " +
                "астероид). Необходимо провести ремонтные работы, иначе вы умрёте.\n" + "Юра тратит тратит много " +
                "времени на то, чтобы залатать пробоину в борту корабля в открытом космосе. -20 ОЭ");
        epInfluenceHp(yura);
        status(yura);
    }

    private void callToEarth(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep + 20;
        yura.setEp(ep);
        System.out.println("Юра успешно исследовал новую планету в системе D-38, уже пятую по счёту. Впереди ещё " +
                "много работы, но сейчас он передаёт данные о ней на родную Землю. Общение с живым существом " +
                "наполняет Юру энергией, немного развеивая тоску от многолетнего одиночества. +20 ОЭ");
        epInfluenceHp(yura);
        status(yura);
    }

    private void meetShip(Astronaut yura) {
        System.out.println("!!!WARNING!!! К Лучу приближается незнакомый корабль. Кажется, он настроен враждебно " +
                "(там готовят торпеды, по всей видимости, для атаки). Это космические пираты!");
        int shipEvNum = (int) (Math.random() * 100);
        if (shipEvNum >= 0 && shipEvNum < 50) {
            int ep = yura.getEp();
            ep = ep - 20;
            yura.setEp(ep);
            System.out.println("Юра активирует режим оптической маскировки и на первой космической сбегает от " +
                    "пиратов. Фух! В этот раз пронесло. -20 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (shipEvNum >= 50 && shipEvNum < 100) {
            int hp = yura.getHp();
            int ep = yura.getEp();
            hp = hp - 40;
            ep = ep - 20;
            yura.setHp(hp);
            yura.setEp(ep);
            System.out.println("Юра слишком поздно заметил приближающийся корабль. Под прицелом торпед он впускает " +
                    "пиратов на борт Луча. Они забрали немало припасов, а напоследок приложили Юру прикладом " +
                    "бластера, чтобы он не увидел, в каком направлении они летят дальше. -40 ОЗ  -20 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void getSick(Astronaut yura) {
        System.out.println("Похоже, при очередной вылазке на поверхность исследуемой планеты Юра подхватил " +
                "неизвестный науке вирус. Потребуется время на то, чтобы медицинский модуль смог идентифицировать " +
                "вирус и найти вакцину, чтобы вылечить Юру.");
        int sickEvNum = (int) (Math.random() * 100);
        if (sickEvNum >= 0 && sickEvNum < 70) {
            int hp = yura.getHp();
            hp = hp - 30;
            yura.setEp(hp);
            System.out.println("Это было весьма неприятно. Медицинский модуль справился с задачей, но Юре стоит быть " +
                    "осторожнее при вылазках на незнакомую местность с другой экосистемой. -30 ОЗ");
            epInfluenceHp(yura);
            status(yura);
        } else if (sickEvNum >= 70 && sickEvNum < 100) {
            yura.setHp(0);
            System.out.println("Структура вируса оказалась слишком сложной для медицинского модуля. Он потратил " +
                    "слишком много времени на расшифровку его РНК и создание вакцины. Юра погиб, принеся свою жизнь " +
                    "в жертву науке.");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void asteroidBelt(Astronaut yura) {
        System.out.println("Бороздя просторы бескрайнего космоса, Юру занесло в пояс астероидов. Сможет ли он " +
                "выбраться отсюда, лавируя между опасными острыми глыбами?");
        int asteroidEventNum = (int) (Math.random() * 100);
        if (asteroidEventNum >= 0 && asteroidEventNum < 25) {
            System.out.println("Юра - просто потрясающий пилот! Он успешно провёл Луч через безумную полосу " +
                    "препятствий. В какой-то момент ему показалось, что это никогда не закончится. Но он справился! " +
                    "Юра не знает, повезёт ли ему так в следующий раз. Стоит быть внимательнее при построении " +
                    "маршрутной карты.");
            epInfluenceHp(yura);
            status(yura);
        } else if (asteroidEventNum >= 25 && asteroidEventNum < 75) {
            int ep = yura.getEp();
            ep = ep - 20;
            yura.setEp(ep);
            System.out.println("Юра с трудом выбрался из этой каменной мясорубки. Корабль получил несколько " +
                    "повреждений, к счастью, не критических, но довольно неприятных. Юра испытал много неприятных " +
                    "и страшных минут. Он очень надеется, что такого больше не повторится. А сейчас ему пора чинить" +
                    " всё то, что сохранит его от кровожадного космоса. -30 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (asteroidEventNum >= 75 && asteroidEventNum < 100) {
            yura.setHp(0);
            System.out.println("О нет. Пояс астероидов споймал новую жертву в свои каменные тиски. Прощай Юра, " +
                    "незадачливый пилот. Обломки Луча присоединились к поясу астероидов, сделав эту ловушку ещё " +
                    "опаснее.");
            status(yura);
        }
    }

    private void sos(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep + 10;
        yura.setEp(ep);
        System.out.println("Луч засёк сигнал бедствия. Кажется, кто-то нуждается в помощи. Юра храбро направляет " +
                "корабль к источнику сигнала. Оказалось, что это торговый корабль, а его пилот немного запутался " +
                "в системе управления и уже битый час не может отключить сигнал SOS. Юру благодарят за готовность " +
                "прийти на помощь и делятся с ним припасами и космическими байками. -20 ОЭ; +30 ОЭ");
        epInfluenceHp(yura);
        status(yura);
    }

    private void systemBroke(Astronaut yura) {
        System.out.println("!!!WARNING!!! Произошёл сбой в системе жизнеобеспечения. На Луче нарушена подача " +
                "кислорода. Необходимо срочно найти причину неполадки и устранить её. Кислорода осталось на 40 минут.");
        int sysEventNum = (int) (Math.random() * 100);
        if (sysEventNum >= 0 && sysEventNum < 40) {
            int ep = yura.getEp();
            ep = ep - 10;
            yura.setEp(ep);
            System.out.println("Такая поломка случается не в первый раз. Юра сноровисто и даже уже привычно " +
                    "решил проблему. -10 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (sysEventNum >= 40 && sysEventNum < 80) {
            int hp = yura.getHp();
            int ep = yura.getEp();
            hp = hp - 20;
            ep = ep - 20;
            yura.setHp(hp);
            yura.setEp(ep);
            System.out.println("Сбой оказался досаточно серьёзным. Юра потратил приличное количество времени, " +
                    "возясь в трубах вентиляции, но всё же успел устранить поломку. Правда, последние минуты он " +
                    "жил без воздуха. Кислородное голодание оставило свой след. -20 ОЗ  -20 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        } else if (sysEventNum >= 80 && sysEventNum < 100) {
            int hp = yura.getHp();
            int ep = yura.getEp();
            hp = hp - 35;
            ep = ep - 35;
            yura.setHp(hp);
            yura.setEp(ep);
            System.out.println("Поломка была настолько серьёзной, что последние минуты ремонта Юре уже казалось, " +
                    "что он вот-вот погибнет, не справившись с подключением резервуара кислорода к системе корабля. " +
                    "-35 ОЗ  -35 ОЭ");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void epInfluenceHp(Astronaut yura) {
        if (yura.getEp() <= 0) {
            int hp = yura.getHp();
            hp = hp - 5;
            if (hp < 0) {
                hp = 0;
            }
            yura.setEp(0);
            yura.setHp(hp);
            System.out.println("Юра обессилен. Он с трудом выполняет работу, к тому же это плохо влияет на его " +
                    "здоровье. -5 ОЗ");
        }
        else if (yura.getEp() >= 100) {
            int hp = yura.getHp();
            hp = hp + 5;
            if (hp > 100) {
                hp = 100;
            }
            yura.setEp(100);
            yura.setHp(hp);
            System.out.println("Юра полон энергии! Он чувствует прилив сил. +5 ОЗ");
        }
    }

    private boolean checkAll(Astronaut yura) {
        return yura.getHp() > 0;
    }

    private void status(Astronaut yura) {
        System.out.println("ОЗ: " + yura.getHp() + ", ОЭ: " + yura.getEp());
    }
}

