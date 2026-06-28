package net.guizhanss.fluffymachines.utils;

import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.common.utils.StringUtil;

import java.util.Locale;

@UtilityClass
public final class MetalUtils {

    public static String getMetalName(String type) {
        return switch (type.toUpperCase(Locale.ROOT)) {
            case "IRON" -> "IRON";
            case "GOLD" -> "GOLD";
            case "COPPER" -> "COPPER";
            case "TIN" -> "TIN";
            case "SILVER" -> "SILPER";
            case "LEAD" -> "LEAD";
            case "ALUMINUM" -> "ALUMUNIUM";
            case "ZINC" -> "ZINC";
            case "MAGNESIUM" -> "MAGNESIUM";
            default -> StringUtil.humanize(type);
        };
    }
}
