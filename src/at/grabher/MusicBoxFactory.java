package at.grabher;

import at.grabher.loader.Loader;
import at.grabher.loader.LoaderDummy;

public class MusicBoxFactory {

    public static MusicBox getBox(){
        Loader loader = new LoaderDummy();
        return loader.getBox();

}
