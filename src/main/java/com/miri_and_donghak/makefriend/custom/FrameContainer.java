package com.miri_and_donghak.makefriend.custom;

import com.miri_and_donghak.makefriend.component.lobby.Lobby;
import com.miri_and_donghak.makefriend.component.makeFriend.MakeFriend;
import com.miri_and_donghak.makefriend.component.showMyFriends.ShowMyFriends;
import com.miri_and_donghak.makefriend.entity.Charcter;

public class FrameContainer {
    private final Lobby lobby;
    private final MakeFriend makeFriend;
    private final ShowMyFriends showMyFriends;

    public FrameContainer() {
        lobby = new Lobby(this);
        lobby.setVisible(false);

        makeFriend = new MakeFriend(this);
        makeFriend.setVisible(false);

        showMyFriends = new ShowMyFriends(this);
        showMyFriends.setVisible(false);
    }

    public void onlyLobby() {
        lobby.setVisible(true);
        makeFriend.setVisible(false);
        showMyFriends.setVisible(false);
    }


    public void onlyMakeFriend() {
        makeFriend.setVisible(true);
        lobby.setVisible(false);
        showMyFriends.setVisible(false);
    }

    public void addCharcterOnMakeFriend(Charcter charcter) {
        makeFriend.addCharcter(charcter);
    }

    public Charcter getCharcterOnMakeFriend() {
        return makeFriend.getCharcter();
    }

    public void onlyShowMyFriends() {
        showMyFriends.setVisible(true);
        makeFriend.setVisible(false);
        lobby.setVisible(false);
    }
}
