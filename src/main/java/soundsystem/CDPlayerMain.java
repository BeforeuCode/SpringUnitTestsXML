package soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("META-INF/spring/stereo.xml");
		//retrieve bean
			/*CompactDisc cd = context.getBean("sgtPeppers",CompactDisc.class);*/
			MediaPlayer player = context.getBean("cdPlayer", MediaPlayer.class);
			//call methods
		player.play();
		//close
		context.close();

	}

}
