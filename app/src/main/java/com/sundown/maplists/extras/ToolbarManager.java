package com.sundown.maplists.extras;

import android.support.v7.widget.Toolbar;

import com.sundown.maplists.R;
import com.sundown.maplists.pojo.MenuOption;

/**
 * Created by Sundown on 7/21/2015.
 */
public class ToolbarManager {

    public Toolbar toolbarTop;
    public Toolbar toolbarBottom;


    public ToolbarManager(Toolbar toolbarTop, Toolbar toolbarBottom){
        this.toolbarTop = toolbarTop;
        this.toolbarBottom = toolbarBottom;
    }


    public void drawMenu(MenuOption... options){
        for (MenuOption option: options){
            switch(option.groupView){

                case EDIT_DELETE:
                    toolbarBottom.getMenu().setGroupVisible(R.id.group_edit_delete, option.show);
                    break;

                case MARKER_COMPONENTS:
                    toolbarBottom.getMenu().setGroupVisible(R.id.group_marker_components, option.show);
                    break;

                case MARKER_MOVE:
                    toolbarBottom.getMenu().setGroupVisible(R.id.group_marker_move, option.show);
                    break;

                case MARKER_NAVIGATION:
                    toolbarTop.getMenu().setGroupVisible(R.id.group_marker_navigation, option.show);
                    break;

                case MAP_COMPONENTS:
                    toolbarTop.getMenu().setGroupVisible(R.id.group_map_components, option.show);
                    break;

                case MAP_ZOOMING:
                    toolbarTop.getMenu().setGroupVisible(R.id.group_map_zooming, option.show);
                    break;


            }
        }
    }


}
