public class Main extends Object {

    
    public static void main(String[] args) {
        Main main;
        main = (new Main());
        main.m1(30);
    }
    public int m1(int p1) {
        println("Calling m1()");
        m2(10);
        return m2(m2(p1));
    }
    public int m2(int p1) {
        return p1;
    }
}
public class A extends Object {

    
    public int m1(int p1) {
        m1(m1(1));
    }
    public int m2() {
        // declare a
        Integer a;
        //assign
        a = 2;
        A aObj;
        aObj = (new A());
        A aObj2;
        aObj2 = aObj;
        Integer b;
        b = ((2 + (3 * 5)) + (m2()));
        m3(new A());
        // for loop
        for(int i = 1; i <= 10; i++) {
            //
            println(i);
        }
        // while loop
        b < a;
        while(a < b) {
            println("abc");
        }
    }
    public void m3(A a) {
    }
}
public class B extends Object {

    
}
// <editor-fold defaultstate="collapsed" desc="VRL-Data">
/*<!VRL!><Type:VRL-Layout>
<map>
  <entry>
    <string>Script:A:m2:inv:declare a:0</string>
    <layout>
      <x>0.0</x>
      <y>560.8915761256095</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:inv:declare this</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>234.10035214108893</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m2:inv:declare p1:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:&lt;init&gt;:0</string>
    <layout>
      <x>5.298789216791987</x>
      <y>341.74385277788593</y>
      <width>237.30134676104134</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:while:inv:println</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:while:inv:println:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m2:inv:declare p1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare aObj</string>
    <layout>
      <x>184.55851414374825</x>
      <y>282.0754641921999</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:op ASSIGN:0</string>
    <layout>
      <x>339.5195024587482</x>
      <y>302.26131220559165</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:&lt;init&gt;</string>
    <layout>
      <x>553.4454789518314</x>
      <y>263.93573262797634</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare aObj2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:inv:m1:0</string>
    <layout>
      <x>122.66608452993668</x>
      <y>217.38934003058185</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:inv:m1:1</string>
    <layout>
      <x>250.36801496185154</x>
      <y>24.52110330626849</y>
      <width>219.86362655709763</width>
      <height>105.89609084103586</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:println</string>
    <layout>
      <x>327.5569820924938</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:inv:m1:2</string>
    <layout>
      <x>122.66608452993668</x>
      <y>217.38934003058185</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:inv:declare this</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2</string>
    <layout>
      <x>13.025737187285108</x>
      <y>572.3929264915944</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1</string>
    <layout>
      <x>12.956127198564078</x>
      <y>250.85009344990937</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:m3:0</string>
    <layout>
      <x>1959.2603065774438</x>
      <y>624.051922041986</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m3</string>
    <layout>
      <x>463.0564293166182</x>
      <y>248.16377275328207</y>
      <width>270.5192061309481</width>
      <height>150.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:0</string>
    <layout>
      <x>12.956127198564078</x>
      <y>250.85009344990937</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:m3</string>
    <layout>
      <x>1959.2603065774438</x>
      <y>624.051922041986</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:m2</string>
    <layout>
      <x>1422.123094855592</x>
      <y>301.3854837790562</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:while:0</string>
    <layout>
      <x>2229.089204601076</x>
      <y>950.532666725818</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:println:0</string>
    <layout>
      <x>327.5569820924938</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:inv:declare i</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op PLUS</string>
    <layout>
      <x>1479.7937330693323</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:inv:declare p1:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op LESS</string>
    <layout>
      <x>1958.4359490217184</x>
      <y>958.8848387896746</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:while:inv:scope:0</string>
    <layout>
      <x>2229.089204601076</x>
      <y>950.532666725818</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:6</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:while</string>
    <layout>
      <x>2229.089204601076</x>
      <y>950.532666725818</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:5</string>
    <layout>
      <x>1958.6159847666372</x>
      <y>300.60237301719906</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op PLUS:0</string>
    <layout>
      <x>1662.4055073419122</x>
      <y>296.82560815896426</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:4</string>
    <layout>
      <x>549.5299251425457</x>
      <y>95.56691882869663</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:inv:declare i:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:3</string>
    <layout>
      <x>186.97448280911595</x>
      <y>468.4814762907447</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op PLUS:1</string>
    <layout>
      <x>1479.7937330693323</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op PLUS:2</string>
    <layout>
      <x>1662.4055073419122</x>
      <y>296.82560815896426</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:m1</string>
    <layout>
      <x>788.6724957327475</x>
      <y>166.7409986427848</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>550.0</width>
      <height>800.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:declare main:0</string>
    <layout>
      <x>6.268340533750971</x>
      <y>184.0121493272315</y>
      <width>226.92968468672723</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m2</string>
    <layout>
      <x>2.273276814135099</x>
      <y>501.4788493468769</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1</string>
    <layout>
      <x>2.810389375071609</x>
      <y>171.05246839134284</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i</string>
    <layout>
      <x>1960.5489501990564</x>
      <y>783.1994093111539</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m2:inv:return:0</string>
    <layout>
      <x>317.0137336180604</x>
      <y>67.06059749612817</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:inv:m1</string>
    <layout>
      <x>250.36801496185154</x>
      <y>24.52110330626849</y>
      <width>219.86362655709763</width>
      <height>105.89609084103586</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:1</string>
    <layout>
      <x>1958.6159847666372</x>
      <y>300.60237301719906</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:&lt;init&gt;:1</string>
    <layout>
      <x>553.4454789518314</x>
      <y>263.93573262797634</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN:0</string>
    <layout>
      <x>549.5299251425457</x>
      <y>95.56691882869663</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:&lt;init&gt;:0</string>
    <layout>
      <x>1957.3273411450245</x>
      <y>461.6828257187865</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:declare p1:0</string>
    <layout>
      <x>0.0</x>
      <y>5.043775074360848</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:0</string>
    <layout>
      <x>1960.5489501990564</x>
      <y>783.1994093111539</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:&lt;init&gt;:2</string>
    <layout>
      <x>1957.3273411450245</x>
      <y>461.6828257187865</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:m2</string>
    <layout>
      <x>557.8033817485431</x>
      <y>5.209674428156646</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:m1:0</string>
    <layout>
      <x>788.6724957327475</x>
      <y>166.7409986427848</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:B:inv:declare this</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m2:0</string>
    <layout>
      <x>2.273276814135099</x>
      <y>501.4788493468769</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op LESS:1</string>
    <layout>
      <x>1958.4359490217184</x>
      <y>958.8848387896746</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op LESS:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op LESS:2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script</string>
    <layout>
      <x>93.17021070620295</x>
      <y>285.9704930717249</y>
      <width>1450.7323227049023</width>
      <height>1294.9093456787427</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m2:inv:return</string>
    <layout>
      <x>317.0137336180604</x>
      <y>67.06059749612817</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op TIMES</string>
    <layout>
      <x>1123.2870168256973</x>
      <y>32.577259205444534</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:declare args:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op TIMES:0</string>
    <layout>
      <x>1123.2870168256973</x>
      <y>32.577259205444534</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:&lt;init&gt;</string>
    <layout>
      <x>5.298789216791987</x>
      <y>341.74385277788593</y>
      <width>237.30134676104134</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m3:0</string>
    <layout>
      <x>463.0564293166182</x>
      <y>248.16377275328207</y>
      <width>270.5192061309481</width>
      <height>150.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m3:inv:declare a:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:return</string>
    <layout>
      <x>1141.6441697799855</x>
      <y>220.06014018593714</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:inv:println:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:m2:2</string>
    <layout>
      <x>557.8033817485431</x>
      <y>5.209674428156646</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:m2:3</string>
    <layout>
      <x>559.0869074846613</x>
      <y>221.0973556465642</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:m2:0</string>
    <layout>
      <x>559.0869074846613</x>
      <y>221.0973556465642</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare b:0</string>
    <layout>
      <x>830.6666886492496</x>
      <y>78.3384820678401</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:m2:1</string>
    <layout>
      <x>886.7073757322762</x>
      <y>223.3879872062529</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:m2:4</string>
    <layout>
      <x>886.7073757322762</x>
      <y>223.3879872062529</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare a</string>
    <layout>
      <x>0.0</x>
      <y>560.8915761256095</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare b</string>
    <layout>
      <x>830.6666886492496</x>
      <y>78.3384820678401</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:inv:println</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:0</string>
    <layout>
      <x>278.5116931800965</x>
      <y>2.2643227087812723</y>
      <width>358.20506165445136</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:inv:scope:0</string>
    <layout>
      <x>1960.5489501990564</x>
      <y>783.1994093111539</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:declare main</string>
    <layout>
      <x>6.268340533750971</x>
      <y>184.0121493272315</y>
      <width>226.92968468672723</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:for:var=i:inv:scope</string>
    <layout>
      <x>1960.5489501990564</x>
      <y>783.1994093111539</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare aObj:0</string>
    <layout>
      <x>184.55851414374825</x>
      <y>282.0754641921999</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:0</string>
    <layout>
      <x>2.810389375071609</x>
      <y>171.05246839134284</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:op ASSIGN</string>
    <layout>
      <x>339.5195024587482</x>
      <y>302.26131220559165</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:declare aObj2:0</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m1:inv:declare p1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:declare p1</string>
    <layout>
      <x>0.0</x>
      <y>5.043775074360848</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m3:inv:declare a</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:m2:0</string>
    <layout>
      <x>1422.123094855592</x>
      <y>301.3854837790562</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:0</string>
    <layout>
      <x>13.025737187285108</x>
      <y>572.3929264915944</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main</string>
    <layout>
      <x>278.5116931800965</x>
      <y>2.2643227087812723</y>
      <width>358.20506165445136</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:m1:inv:return:0</string>
    <layout>
      <x>1141.6441697799855</x>
      <y>220.06014018593714</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:Main:main:inv:declare args</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:while:inv:scope</string>
    <layout>
      <x>2229.089204601076</x>
      <y>950.532666725818</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:B</string>
    <layout>
      <x>23.797874645737593</x>
      <y>862.6729559079877</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A</string>
    <layout>
      <x>633.9817552916419</x>
      <y>128.2921806347189</y>
      <width>550.0</width>
      <height>800.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:A:m2:inv:op ASSIGN</string>
    <layout>
      <x>186.97448280911595</x>
      <y>468.4814762907447</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
</map>
*/
// </editor-fold>