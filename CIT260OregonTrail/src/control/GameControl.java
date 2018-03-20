/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit260oregontrail.CIT260OregonTrail;
import exceptions.GameControlException;
import exceptions.MapControlException;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import model.Game;
import model.Items;
import model.Map;
import model.Occupation;
import model.Player;
import model.WagonPartyMembers;
import view.paceList;

/**
 *
 * @author bould
 */
public class GameControl {

    public static Player savePlayer(String playersName) throws GameControlException {
        //savePlayer(name): Player
        //BEGIN
        //    if name is null OR length of name is < 1 THEN
        //        RETURN null
        //    ENDIF
        //    player = new Player object
        //    save the name in the player object
        //    save the player in the main class of the project
        //    RETURN player
        //END
        if(playersName == null || playersName.length() < 1){
            throw new GameControlException("The name cannot be blank");
            
        }
        Player player = new Player();
        player.setName(playersName);
        CIT260OregonTrail.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) throws GameControlException, MapControlException{
        if(player == null){
            throw new GameControlException("You must enter a Name." );
        }
        Game game = new Game();
        game.setPlayer(player); // Save player in the game
        
        //Items creation
        ArrayList<Items> items = ItemControl.createItems();
        game.setItems(items);
        
        //Map Creation
        Map map = MapControl.createMap(4,4);
        game.setMap(map);
        
        
        game.setPace(paceList.MODERATE.ordinal()); 
        CIT260OregonTrail.setGame(game);
        
        
    }
    
    public static ArrayList<Occupation> createOccupations(){
        ArrayList<Occupation> occupationList = new ArrayList<>();
        Occupation newOccupation = new Occupation();
        
        newOccupation.setName("Banker");
        newOccupation.setMoney(1600);
        newOccupation.setDescription("Be a banker from Boston");
        
        occupationList.add(newOccupation);
        
        newOccupation = new Occupation();
        
        newOccupation.setName("Carpenter");
        newOccupation.setMoney(800);
        newOccupation.setDescription("Be carpenter from Ohio");
        
        occupationList.add(newOccupation);
        
        newOccupation = new Occupation();
        
        newOccupation.setName("Farmer");
        newOccupation.setMoney(800);
        newOccupation.setDescription("Be farmer from Illinois");
        
        occupationList.add(newOccupation);
        
        
        return occupationList;
    }
    
    public static ArrayList<WagonPartyMembers> createWagonPartyMember(){
        ArrayList<WagonPartyMembers> inputs = new ArrayList<>();
        for (int i=0; i<6; i++){
            WagonPartyMembers newWagonPartyMembers = new WagonPartyMembers();
            newWagonPartyMembers.setName("yr");

            inputs.add(newWagonPartyMembers);
        }
        return inputs;
    }
    
}
