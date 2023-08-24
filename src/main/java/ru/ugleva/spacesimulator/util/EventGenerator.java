package ru.ugleva.spacesimulator.util;

import ru.ugleva.spacesimulator.model.Astronaut;

public class EventGenerator {
    public void startAdventure(Astronaut yura) {
        System.out.println("����� ���������� � ��������� ����� ���������� ��� �� ����� ������������������ ������������ " +
                "������� \"���\"");
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
        System.out.println("��� ������ ���.\n��� ������ ����������.\n������� ���, �� �� �����.");
    }

    private void sleep(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep + 40;
        yura.setEp(ep);
        System.out.println("����� �� ���������� �������� ����, ��� �����, ��� ����� �������. +40 ��");
        epInfluenceHp(yura);
        status(yura);
    }

    private void eat(Astronaut yura) {
        System.out.println("������ ����� �����! ���� ������������");
        int eatEventNum = (int) (Math.random() * 100);
        if (eatEventNum >= 0 && eatEventNum < 25) {
            int ep = yura.getEp();
            ep = ep + 30;
            yura.setEp(ep);
            System.out.println("��� ����� ������� ����� ������� �������� ������ � ������� ����. � ����� ��� ����� " +
                    "���, ��� ������, �� ����� �� ������ ���������! (������� ����� ���, ������ �������� ������������ " +
                    "�����������) +30 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (eatEventNum >= 25 && eatEventNum < 50) {
            int ep = yura.getEp();
            ep = ep + 20;
            yura.setEp(ep);
            System.out.println("������ ����� ������� ��������, ���������� ���������� ��������� ����. ��� ������� " +
                    "����������� ������ ����������� ������� � ����� ������ ������ � �������������. +20 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (eatEventNum >= 50 && eatEventNum < 75) {
            int ep = yura.getEp();
            ep = ep + 10;
            yura.setEp(ep);
            System.out.println("����! ������, �����, �������� ������� �������, �������� ������������. ������� ����� " +
                    "��������� � ������� �������� ����. +10 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (eatEventNum >= 75 && eatEventNum < 100) {
            int ep = yura.getEp();
            ep = ep - 5;
            yura.setEp(ep);
            System.out.println("��� � ������� ������� �� ������ ������ ������, ������� ������ �������. ����, �� " +
                    "������� �� ������� ��� �����. -5 ��");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void talkRobot(Astronaut yura) {
        System.out.println("�� ����� ��������, ��� �������������. ��� ������� �� ����� ������������ ������������ - " +
                "������� R3D3. ������, ��� ������, �����������, ����� ����� ������������ ����� ��� ��� ����������. " +
                "���, ������� ������� ��������� ����� �� �������, ����� ��������� ����� ��������������, - �� " +
                "������������ ����� ��������� ����. +20 ��; -20 ��");
        status(yura);
    }

    private void flyAsteroid(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep - 20;
        yura.setEp(ep);
        System.out.println("!!!WARNING!!! ��������� ������������ � ������������ �������� (���������������� ���: " +
                "��������). ���������� �������� ��������� ������, ����� �� �����.\n" + "��� ������ ������ ����� " +
                "������� �� ��, ����� �������� �������� � ����� ������� � �������� �������. -20 ��");
        epInfluenceHp(yura);
        status(yura);
    }

    private void callToEarth(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep + 20;
        yura.setEp(ep);
        System.out.println("��� ������� ���������� ����� ������� � ������� D-38, ��� ����� �� �����. ������� ��� " +
                "����� ������, �� ������ �� ������� ������ � ��� �� ������ �����. ������� � ����� ��������� " +
                "��������� ��� ��������, ������� ��������� ����� �� ������������ �����������. +20 ��");
        epInfluenceHp(yura);
        status(yura);
    }

    private void meetShip(Astronaut yura) {
        System.out.println("!!!WARNING!!! � ���� ������������ ���������� �������. �������, �� �������� ��������� " +
                "(��� ������� �������, �� ���� ���������, ��� �����). ��� ����������� ������!");
        int shipEvNum = (int) (Math.random() * 100);
        if (shipEvNum >= 0 && shipEvNum < 50) {
            int ep = yura.getEp();
            ep = ep - 20;
            yura.setEp(ep);
            System.out.println("��� ���������� ����� ���������� ���������� � �� ������ ����������� ������� �� " +
                    "�������. ���! � ���� ��� ��������. -20 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (shipEvNum >= 50 && shipEvNum < 100) {
            int hp = yura.getHp();
            int ep = yura.getEp();
            hp = hp - 40;
            ep = ep - 20;
            yura.setHp(hp);
            yura.setEp(ep);
            System.out.println("��� ������� ������ ������� �������������� �������. ��� �������� ������ �� �������� " +
                    "������� �� ���� ����. ��� ������� ������ ��������, � ���������� ��������� ��� ��������� " +
                    "��������, ����� �� �� ������, � ����� ����������� ��� ����� ������. -40 ��  -20 ��");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void getSick(Astronaut yura) {
        System.out.println("������, ��� ��������� ������� �� ����������� ����������� ������� ��� ��������� " +
                "����������� ����� �����. ����������� ����� �� ��, ����� ����������� ������ ���� ���������������� " +
                "����� � ����� �������, ����� �������� ���.");
        int sickEvNum = (int) (Math.random() * 100);
        if (sickEvNum >= 0 && sickEvNum < 70) {
            int hp = yura.getHp();
            hp = hp - 30;
            yura.setEp(hp);
            System.out.println("��� ���� ������ ���������. ����������� ������ ��������� � �������, �� ��� ����� ���� " +
                    "���������� ��� �������� �� ���������� ��������� � ������ �����������. -30 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (sickEvNum >= 70 && sickEvNum < 100) {
            yura.setHp(0);
            System.out.println("��������� ������ ��������� ������� ������� ��� ������������ ������. �� �������� " +
                    "������� ����� ������� �� ����������� ��� ��� � �������� �������. ��� �����, ������� ���� ����� " +
                    "� ������ �����.");
            epInfluenceHp(yura);
            status(yura);
        }
    }

    private void asteroidBelt(Astronaut yura) {
        System.out.println("������� �������� ����������� �������, ��� ������� � ���� ����������. ������ �� �� " +
                "��������� ������, ������� ����� �������� ������� �������?");
        int asteroidEventNum = (int) (Math.random() * 100);
        if (asteroidEventNum >= 0 && asteroidEventNum < 25) {
            System.out.println("��� - ������ ����������� �����! �� ������� ����� ��� ����� �������� ������ " +
                    "�����������. � �����-�� ������ ��� ����������, ��� ��� ������� �� ����������. �� �� ���������! " +
                    "��� �� �����, ������ �� ��� ��� � ��������� ���. ����� ���� ������������ ��� ���������� " +
                    "���������� �����.");
            epInfluenceHp(yura);
            status(yura);
        } else if (asteroidEventNum >= 25 && asteroidEventNum < 75) {
            int ep = yura.getEp();
            ep = ep - 20;
            yura.setEp(ep);
            System.out.println("��� � ������ �������� �� ���� �������� ���������. ������� ������� ��������� " +
                    "�����������, � �������, �� �����������, �� �������� ����������. ��� ������� ����� ���������� " +
                    "� �������� �����. �� ����� ��������, ��� ������ ������ �� ����������. � ������ ��� ���� ������" +
                    " �� ��, ��� �������� ��� �� ������������ �������. -30 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (asteroidEventNum >= 75 && asteroidEventNum < 100) {
            yura.setHp(0);
            System.out.println("� ���. ���� ���������� ������� ����� ������ � ���� �������� �����. ������ ���, " +
                    "������������ �����. ������� ���� �������������� � ����� ����������, ������ ��� ������� ��� " +
                    "�������.");
            status(yura);
        }
    }

    private void sos(Astronaut yura) {
        int ep = yura.getEp();
        ep = ep + 10;
        yura.setEp(ep);
        System.out.println("��� ���� ������ ��������. �������, ���-�� ��������� � ������. ��� ������ ���������� " +
                "������� � ��������� �������. ���������, ��� ��� �������� �������, � ��� ����� ������� ��������� " +
                "� ������� ���������� � ��� ����� ��� �� ����� ��������� ������ SOS. ��� ���������� �� ���������� " +
                "������ �� ������ � ������� � ��� ��������� � ������������ �������. -20 ��; +30 ��");
        epInfluenceHp(yura);
        status(yura);
    }

    private void systemBroke(Astronaut yura) {
        System.out.println("!!!WARNING!!! ��������� ���� � ������� ����������������. �� ���� �������� ������ " +
                "���������. ���������� ������ ����� ������� ��������� � ��������� �. ��������� �������� �� 40 �����.");
        int sysEventNum = (int) (Math.random() * 100);
        if (sysEventNum >= 0 && sysEventNum < 40) {
            int ep = yura.getEp();
            ep = ep - 10;
            yura.setEp(ep);
            System.out.println("����� ������� ��������� �� � ������ ���. ��� ���������� � ���� ��� �������� " +
                    "����� ��������. -10 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (sysEventNum >= 40 && sysEventNum < 80) {
            int hp = yura.getHp();
            int ep = yura.getEp();
            hp = hp - 20;
            ep = ep - 20;
            yura.setHp(hp);
            yura.setEp(ep);
            System.out.println("���� �������� ��������� ���������. ��� �������� ��������� ���������� �������, " +
                    "������ � ������ ����������, �� �� �� ����� ��������� �������. ������, ��������� ������ �� " +
                    "��� ��� �������. ����������� ��������� �������� ���� ����. -20 ��  -20 ��");
            epInfluenceHp(yura);
            status(yura);
        } else if (sysEventNum >= 80 && sysEventNum < 100) {
            int hp = yura.getHp();
            int ep = yura.getEp();
            hp = hp - 35;
            ep = ep - 35;
            yura.setHp(hp);
            yura.setEp(ep);
            System.out.println("������� ���� ��������� ���������, ��� ��������� ������ ������� ��� ��� ��������, " +
                    "��� �� ���-��� ��������, �� ����������� � ������������ ���������� ��������� � ������� �������. " +
                    "-35 ��  -35 ��");
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
            System.out.println("��� ���������. �� � ������ ��������� ������, � ���� �� ��� ����� ������ �� ��� " +
                    "��������. -5 ��");
        }
        else if (yura.getEp() >= 100) {
            int hp = yura.getHp();
            hp = hp + 5;
            if (hp > 100) {
                hp = 100;
            }
            yura.setEp(100);
            yura.setHp(hp);
            System.out.println("��� ����� �������! �� ��������� ������ ���. +5 ��");
        }
    }

    private boolean checkAll(Astronaut yura) {
        return yura.getHp() > 0;
    }

    private void status(Astronaut yura) {
        System.out.println("��: " + yura.getHp() + ", ��: " + yura.getEp());
    }
}

