import {Card} from '../primitives/Card';
import {CardRow} from '../primitives/CardRow';
import {Queue} from '../../types';

export function QueueCard({queue}: {queue: Queue}) {
    const started = (queue.startDate !== null && queue.startDate !== undefined ? <CardRow>Started at {queue.startDate}</CardRow> : <></>)
    return (
        <Card>
            <CardRow>
                <h5>{queue.name}</h5>
            </CardRow>
            {started}
        </Card>
    );
}