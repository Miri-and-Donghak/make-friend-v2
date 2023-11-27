package com.miri_and_donghak.makefriend.custom;

import com.miri_and_donghak.makefriend.component.lobby.Lobby;
import com.miri_and_donghak.makefriend.component.makeFriend.MakeFriend;
import com.miri_and_donghak.makefriend.component.showMyFriends.ShowMyFriends;
import com.miri_and_donghak.makefriend.domain.entity.Charcter;
import jakarta.persistence.Lob;

import javax.swing.*;
import java.util.ArrayList;

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

    public void addCharcter(Charcter charcter) {
        makeFriend.addCharcter(charcter);
    }

    public Charcter getCharcter() {
        return makeFriend.getCharcter();
    }

    public void onlyShowMyFriends() {
        showMyFriends.setVisible(true);
        makeFriend.setVisible(false);
        lobby.setVisible(false);
    }
}
