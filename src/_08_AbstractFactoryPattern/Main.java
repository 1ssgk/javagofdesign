package _08_AbstractFactoryPattern;

import _08_AbstractFactoryPattern.factory.Factory;
import _08_AbstractFactoryPattern.factory.Link;
import _08_AbstractFactoryPattern.factory.Page;
import _08_AbstractFactoryPattern.factory.Tray;

public class Main {
  public static void main(String[] args) {
    //args = new String[]{"abstractFactory.factory.Link"};
    args = new String[]{"abstractFactory.listfactory.ListFactory"};


    if (args.length != 1) {
      System.out.println("전달된 환경변수가 존재하지 않습니다.");
      System.out.println("Usage: java Main class.name.of.ConcreteFactory");
      System.out.println("Example: java Main listFactory.ListFactory");
    }

    final Factory factory = Factory.getFactory(args[0]);

    Link googleLink = factory.createLink("구글", "http://www.google.co.kr");
    Link naverLink = factory.createLink("네이버", "http://www.naver.co.kr");

    Link netflixLink = factory.createLink("넷플릭스", "https://www.netflix.com");

    final Tray searchTray = factory.createTray("검색플랫폼");
    searchTray.add(googleLink);
    searchTray.add(naverLink);

    final Tray ottTray = factory.createTray("OTT");
    ottTray.add(netflixLink);

    final Page page = factory.createPage("LinkPage", "테스트 페이지");

    page.add(searchTray);
    page.add(ottTray);

    page.output();
  }
}
