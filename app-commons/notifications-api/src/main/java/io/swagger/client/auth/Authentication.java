package de.hs_bremen.aurora_hunter.commons.notifications.auth;

import de.hs_bremen.aurora_hunter.commons.notifications.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
