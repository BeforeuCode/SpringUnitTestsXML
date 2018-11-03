package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public CDPlayer() {
  }

  public void play() {
    cd.play();
  }

  public CompactDisc getCd() {
    return cd;
  }

  public void setCd(CompactDisc cd) {
    this.cd = cd;
  }
}
