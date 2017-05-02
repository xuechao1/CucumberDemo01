#language: zh-CN
功能: 163登录功能
  @Automation
  场景: 测试正确的帐号登录
    当我打开163网站
    并且我在email文本框输入"meyoungtester"
    并且我在密码框输入"meyoung123"
    当我点击登陆成功
    那么我登陆成功
  @p0
  场景: 测试正确的帐号登录2
    * 我打开163网站
    * 我在email文本框输入"meyoungtester"
    * 我在密码框输入"meyoung123"
    * 我点击登陆成功
    * 我登陆成功
  @p1
  场景大纲: : 测试正确的帐号登录3
    假如我打开163网站
    当我用"<email>"帐号，密码"<pwd>"登录
    那么我登陆成功

    例子:
      | email  | pwd  |
      | test1 | pwd1 |
      | test2 | pwd2 |

  场景大纲: 登录
    当我打开163网站
    当我在email文本框输入"<username>"
    并且我在密码框输入"<pwd>"
    那么我登陆成功

    例子:
      | username   | pwd   |
      | username1 | pwd1 |
      | username2 | pwd2 |
      | username3 | pwd3 |
      | username4 | pwd4 |


