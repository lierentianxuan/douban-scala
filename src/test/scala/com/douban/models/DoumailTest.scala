package com.douban.models

import com.douban.common.BaseTest

/**
 * Copyright by <a href="http://crazyadam.net"><em><i>Joseph J.C. Tang</i></em></a> <br/>
 * Email: <a href="mailto:jinntrance@gmail.com">jinntrance@gmail.com</a>
 * @author joseph
 * @since 1/16/13 11:38 PM
 * @version 1.0
 */
class DoumailTest extends BaseTest{
  val receiverId="61205173"
  val dId="290817815"
   test("doumail test"){
//     prettyJSON(Doumail.byId(dId))
     prettyJSON(Doumail.byIdKeepUnread(dId))
     prettyJSON(Doumail.inbox)
     prettyJSON(Doumail.outbox)
     prettyJSON(Doumail.unreadMails)
     prettyJSON(Doumail.readMails(List(dId)))
//     prettyJSON(Doumail.deleteMails(List(dId)))
//     prettyJSON(Doumail.delete(dId))
     prettyJSON(Doumail.send(DoumailSent("呵呵了","申友寒假“GMAT 700精讲班”热招，8天超长名师面授，52天跟踪辅导，2月突破700+ ",receiverId)))
   }
}
