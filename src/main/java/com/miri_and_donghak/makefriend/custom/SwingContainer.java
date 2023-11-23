package com.miri_and_donghak.makefriend.custom;

import com.miri_and_donghak.makefriend.component.lobby.Lobby;
import com.miri_and_donghak.makefriend.component.makeFriend.MakeFriend;
import com.miri_and_donghak.makefriend.component.showMyFriends.ShowMyFriends;
import jakarta.persistence.Lob;

import javax.swing.*;

public class SwingContainer {
    private final Lobby lobby;
    private final MakeFriend makeFriend;
    private final ShowMyFriends showMyFriends;

    public SwingContainer() {
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

    public void onlyShowMyFriends() {
        showMyFriends.setVisible(true);
        makeFriend.setVisible(false);
        lobby.setVisible(false);
    }
}
