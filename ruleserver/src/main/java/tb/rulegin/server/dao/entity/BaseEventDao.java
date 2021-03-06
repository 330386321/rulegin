package tb.rulegin.server.dao.entity;

import tb.rulegin.server.common.data.Event;
import tb.rulegin.server.common.data.id.EntityId;
import tb.rulegin.server.common.data.page.TimePageLink;
import tb.rulegin.server.dao.event.EventDao;
import com.google.common.util.concurrent.ListenableFuture;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by Jary on 2017/9/27 0027.
 */
@Service
public class BaseEventDao implements EventDao {
    @Override
    public List<Event> find() {
        return null;
    }

    @Override
    public Event findById(UUID id) {
        return null;
    }

    @Override
    public ListenableFuture<Event> findByIdAsync(UUID id) {
        return null;
    }

    @Override
    public boolean removeById(UUID id) {
        return false;
    }

    @Override
    public Event save(Event event) {
        return null;
    }

    @Override
    public Optional<Event> saveIfNotExists(Event event) {
        return null;
    }

    @Override
    public Event findEvent(EntityId entityId, String eventType, String eventUid) {
        return null;
    }

    @Override
    public List<Event> findEvents(EntityId entityId, TimePageLink pageLink) {
        return null;
    }

    @Override
    public List<Event> findEvents(EntityId entityId, String eventType, TimePageLink pageLink) {
        return null;
    }
}
