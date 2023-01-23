package _08_AbstractFactoryPattern.listfactory;

import _08_AbstractFactoryPattern.factory.Factory;
import _08_AbstractFactoryPattern.factory.Link;
import _08_AbstractFactoryPattern.factory.Page;
import _08_AbstractFactoryPattern.factory.Tray;

public class ListFactory extends Factory {
  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption,url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new ListPage(title,author);
  }
}
