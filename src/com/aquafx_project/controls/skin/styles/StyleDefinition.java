package com.aquafx_project.controls.skin.styles;

/**
 * The StyleDefinition interface defines classes that contain different style variations for a
 * specific Control.
 * <p>
 * Implemented StyleDefinitions are:
 * <ul>
 * <li>{@link ButtonType ButtonTypes}
 * <li>{@link com.aquafx_project.controls.skin.styles.ControlSizeVariant ControlSizeVariant}
 * <li>{@link com.aquafx_project.controls.skin.styles.MacOSDefaultIcons MacOSDefaultIcons}
 * <li>{@link TabPaneType TabPaneType}
 * <li>{@link TextFieldType TextFieldType}
 * </ul>
 * 
 * @author claudinezillmann
 * 
 */
public interface StyleDefinition {

    /**
     * Constructs a String as name for the StyleClass.
     * 
     * @return the name for the StyleDefinition
     */
    String getStyleName();
}
