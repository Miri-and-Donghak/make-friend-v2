package com.miri_and_donghak.makefriend.custom;

import com.miri_and_donghak.makefriend.component.lobby.Lobby;
import com.miri_and_donghak.makefriend.component.makeFriend.MakeFriend;
import com.miri_and_donghak.makefriend.component.makeFriend.components.ShowCharacter;
import com.miri_and_donghak.makefriend.component.showMyFriends.ShowMyFriends;
import com.miri_and_donghak.makefriend.entity.Character;
import com.miri_and_donghak.makefriend.entity.enums.Accessories;

import java.awt.*;
import java.util.*;

public class FrameContainer {
    private HashMap<String ,Character> characters = new HashMap<>();
    private final Lobby lobby;
    private final MakeFriend makeFriend;

    private ShowMyFriends showMyFriends;


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

    public void onlyShowMyFriends() {
        showMyFriends = new ShowMyFriends(this);
        showMyFriends.setVisible(true);
        makeFriend.setVisible(false);
        lobby.setVisible(false);
    }

    public void addCharacter(Character character, String name){
        characters.put(name, character);
    }

    public Character findCharacterByName(String name){
        return characters.get(name);
    }

    public HashMap<String, Character> findAllCharacter(){
        return characters;
    }

    public ArrayList<Accessories> getCharacterAccessorie(){
        return makeFriend.getAccessorieList();
    }

    public void addShowCharacterStatus(ArrayList<Accessories> accessories){
        for(Accessories ac : accessories){
            makeFriend.getShowCharacterStatus().add(new ShowCharacter(ac.getName()));
        }
    }
}